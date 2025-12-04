# python/ml_api.py
from fastapi import FastAPI
from pydantic import BaseModel
import joblib
import os

app = FastAPI(title="ML Models API")

# charge modèles au démarrage
MODEL_DIR = os.path.join(os.path.dirname(__file__), "models")
reg_model = joblib.load(os.path.join(MODEL_DIR, "regression_model.pkl"))
cluster_model = joblib.load(os.path.join(MODEL_DIR, "cluster_model.pkl"))

class Customer(BaseModel):
    age: int
    income: int

@app.get("/")
def root():
    return {"status":"ok", "note":"ML API running"}

@app.post("/predict/spending")
def predict_spending(c: Customer):
    X = [[c.age, c.income]]
    pred = reg_model.predict(X)
    return {"spending": float(pred[0])}

@app.post("/predict/cluster")
def predict_cluster(c: Customer):
    X = [[c.age, c.income]]
    cluster = cluster_model.predict(X)
    return {"cluster": int(cluster[0])}
