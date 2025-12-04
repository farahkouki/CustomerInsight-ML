# 🚀 ML Service Project


**Application full-stack de Machine Learning** combinant un **modèle Python (scikit-learn)**, un **backend réactif Spring Boot (WebFlux)** et un **frontend moderne en React**.

Prédiction en temps réel de dépenses clients et classification par clustering !

---

## ⚡ Fonctionnalités

| Fonctionnalité                        | Description                                      |
|---------------------------------------|--------------------------------------------------|
| 📊 **Prédiction de dépenses**         | Estimation du montant dépensé par un client     |
| 🧩 **Clustering de clients**          | Classification automatique en segments (KMeans) |
| 🎨 **Frontend React interactif**      | Interface fluide avec visualisations            |
| ⚡ **API REST réactive**               | Communication ultra-rapide via Spring WebFlux   |
| 🔗 **Intégration Python ↔ Java**      | Appel direct au modèle ML via processus Python  |
| 🛠 **Stack moderne**                   | Java 17 • React • Python • Maven • npm          |

---

## 🗂 Structure du projet
mlservice-project/
├── backend/          → Spring Boot (Java 17 + WebFlux)
├── frontend/         → React App (Vite/Create-React-App)
├── python-ml/        → Modèle ML + script d'inférence (optionnel)
└── assets/           → Images, bannières, etc.

---

## 🖥️ Backend (Spring Boot)

**Technologies** : Spring Boot 3 • WebFlux • Java 17 • Maven

### Endpoints disponibles

| Méthode | Endpoint                        | Body (exemple)                            | Retour                       |
|---------|----------------------------------|-------------------------------------------|------------------------------|
| POST    | `/api/predict/spending`          | `{"age": 30, "income": 50000}`            | `{"predictedSpending": 2850}` |
| POST    | `/api/predict/cluster`           | `{"age": 30, "income": 50000}`            | `{"cluster": 2, "label": "Haut revenu - Jeune"}` |

🌈 Frontend (React)
Technologies : React • Axios • Chart.js (ou Recharts) • TailwindCSS / CSS Modules
🚀 Lancer le frontend
Bashcd frontend
npm install
npm start
Ouvrir : http://localhost:3000

🔄 Diagramme de flux d'architecture
<img width="1365" height="280" alt="image" src="https://github.com/user-attachments/assets/4ae66803-ee03-4a86-a1bc-af0c8d0b9af7" />

### Exemple de requête cURL
# Prédiction de dépenses
curl -X POST http://localhost:8080/api/predict/spending \
  -H "Content-Type: application/json" \
  -d '{"age": 35, "income": 75000}'

# Clustering
curl -X POST http://localhost:8080/api/predict/cluster \
  -H "Content-Type: application/json" \
  -d '{"age": 28, "income": 42000}'
