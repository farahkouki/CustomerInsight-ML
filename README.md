# 🚀 ML Service Project

![ML Banner](https://raw.githubusercontent.com/tonnom/mlservice-project/main/assets/banner.png)

**Machine Learning Service** avec **Spring Boot Backend**, **React Frontend**, et intégration avec un modèle ML Python.  

---
 ## ⚡ Fonctionnalités

📊 Prédiction de dépenses clients

🧩 Classification de clients en clusters

🌐 Frontend React interactif

🔗 Communication via API REST

🛠 Développement full-stack moderne

## 🗂 Structure du projet

🖥️ Backend
Technologies : Spring Boot, WebFlux, Java 17
Endpoints :
POST /api/predict/spending : { "age": 30, "income": 50000 }
POST /api/predict/cluster : { "age": 30, "income": 50000 }
Démarrer le backend :
cd backend
..\..\apache-maven-3.9.9-bin\apache-maven-3.9.9\bin\mvn.cmd spring-boot:run

🌈 Frontend
Technologies : React, JavaScript, HTML5, CSS3
Démarrer le frontend :
cd frontend
npm install
npm start

🔗 Diagramme de flux
flowchart LR
    A[Frontend React] -->|POST JSON| B[Spring Boot Backend]
    B -->|Appel ML Python| C[Python ML Model]
    C -->|Résultat| B
    B -->|Réponse JSON| A


