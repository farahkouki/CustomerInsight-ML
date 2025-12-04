import React, { useState } from 'react';
import axios from 'axios';

function App() {
  const [age, setAge] = useState('');
  const [income, setIncome] = useState('');
  const [spending, setSpending] = useState(null);
  const [cluster, setCluster] = useState(null);

  const callApi = async () => {
    const payload = { age: Number(age), income: Number(income) };
    try {
      const sp = await axios.post('http://localhost:8080/api/predict/spending', payload);
      setSpending(sp.data);
      const cl = await axios.post('http://localhost:8080/api/predict/cluster', payload);
      setCluster(cl.data);
    } catch (err) {
      console.error(err);
      alert('Erreur lors de l’appel API. Vérifie que le backend et l’API Python sont démarrés.');
    }
  };

  return (
    <div style={{ padding: 20 }}>
      <h2>ML Test (Supervised + Unsupervised)</h2>
      <div style={{ display: 'flex', gap: 8, marginBottom: 8 }}>
        <input placeholder="Age" value={age} onChange={e => setAge(e.target.value)} />
        <input placeholder="Income" value={income} onChange={e => setIncome(e.target.value)} />
        <button onClick={callApi}>Predict</button>
      </div>

      {spending && <div><strong>Predicted spending:</strong> {spending.spending}</div>}
      {cluster && <div><strong>Cluster:</strong> {cluster.cluster}</div>}
    </div>
  );
}

export default App;
