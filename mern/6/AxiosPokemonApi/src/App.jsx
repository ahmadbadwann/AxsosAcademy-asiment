import { useState } from 'react'
import axios from "axios";
import './App.css'

function App() {
  const [pokemon, setPokemon] = useState([]);
  const [loading, setLoading] = useState(false);

  const fetchPokemon = () => {
    setLoading(true);

    axios
      .get("https://pokeapi.co/api/v2/pokemon?limit=807")
      .then((response) => {
        setPokemon(response.data.results);
        setLoading(false);
      })
      .catch((error) => {
        console.error(error);
        setLoading(false);
      });
  };

  return (
    <div style={{ padding: "20px" }}>
      <h1>Pokemon List (Axios)</h1>

      <button onClick={fetchPokemon}>
        Fetch Pokemon
      </button>

      {loading && <p>Loading...</p>}

      <ul>
        {pokemon.map((p, index) => (
          <li key={index}>{p.name}</li>
        ))}
      </ul>
    </div>
  );
}
export default App
