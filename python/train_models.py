# python/train_models.py
import pandas as pd
from sklearn.linear_model import LinearRegression
from sklearn.cluster import KMeans
from joblib import dump
import os

os.makedirs("models", exist_ok=True)

# Jeu de données simple (exemple)
data = pd.DataFrame({
    "age":[25,32,47,51,62,23,44,29,36,55],
    "income":[2000,3200,4500,5400,6200,1800,4100,3000,3600,5000],
    "spending":[400,520,1000,1100,1500,380,900,450,600,1050]
})

X = data[["age","income"]]
y = data["spending"]

# modèle supervisé (régression)
reg = LinearRegression().fit(X, y)
dump(reg, "models/regression_model.pkl")
print("Saved models/regression_model.pkl")

# modèle non supervisé (kmeans)
k = KMeans(n_clusters=3, random_state=42, n_init=10).fit(X)
dump(k, "models/cluster_model.pkl")
print("Saved models/cluster_model.pkl")
