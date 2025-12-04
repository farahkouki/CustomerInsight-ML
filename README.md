# 🚀 ML Service Project


Application full-stack de Machine Learning combinant :
Python (scikit-learn) pour le modèle ML
Backend réactif Spring Boot (WebFlux)

Frontend moderne en React
L’application permet de :
💰 Prédire les dépenses d’un client (algorithme supervisé)
📊 Classifier les clients par clusters (algorithme non supervisé)

⚡ Réponses instantanées grâce à WebFlux et WebClient
🧠 Algorithmes utilisés
Supervisé : Linear Regression pour la prédiction des dépenses (spending)
Non supervisé : K-Means Clustering pour classifier les clients selon leur profil (cluster)


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
🔄 Diagramme de flux d'architecture
<img width="1365" height="280" alt="image" src="https://github.com/user-attachments/assets/4ae66803-ee03-4a86-a1bc-af0c8d0b9af7" />

---

## 🖥️ Backend (Spring Boot)

**Technologies** : Spring Boot 3 • WebFlux • Java 17 • Maven

### Endpoints disponibles

| Méthode | Endpoint                        | Body (exemple)                            | Retour                       |
|---------|----------------------------------|-------------------------------------------|------------------------------|
| POST    | `/api/predict/spending`          | `{"age": 30, "income": 50000}`            | `{"predictedSpending": 2850}` |
| POST    | `/api/predict/cluster`           | `{"age": 30, "income": 50000}`            | `{"cluster": 2, "label": "Haut revenu - Jeune"}` |

## 🌈 Frontend (React)
**Technologies** : React • Axios • Chart.js (ou Recharts) • TailwindCSS / CSS Modules

🚀 Lancer le frontend

Bashcd frontend
npm install
npm start
Ouvrir : http://localhost:3000
---
### Exemple de requête cURL
# Prédiction de dépenses
curl -X POST http://localhost:8080/api/predict/spending \
  -H "Content-Type: application/json" \
  -d '{"age": 35, "income": 75000}'

# Clustering
curl -X POST http://localhost:8080/api/predict/cluster \
  -H "Content-Type: application/json" \
  -d '{"age": 28, "income": 42000}'
