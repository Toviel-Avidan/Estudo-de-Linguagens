import { useState } from "react";
import "./BusinessCard.css";

import { FaEnvelope, FaPhone, FaUser } from "react-icons/fa";

function BusinessCard({ nome, profissao, email, telefone }) {
  const [mostrarContato, setMostrarContato] = useState(false);

  return (
    <div className="card">

      {/* 👇 1. AVATAR (coloca aqui no topo do card) */}
      <div className="avatar">
        {nome.charAt(0)}
      </div>

      {/* 👇 2. NOME E PROFISSÃO */}
      <h2 className="nome">{nome}</h2>
      <h3>{profissao}</h3>

      {/* 👇 3. BADGE (status) */}
      <span className="badge">Disponível para vagas</span>

      {/* 👇 4. BOTÃO */}
      <button onClick={() => setMostrarContato(!mostrarContato)}>
        {mostrarContato ? "Ocultar Contato" : "Mostrar Contato"}
      </button>

      {/* 👇 5. CONTATO (email e telefone) */}
      {mostrarContato && (
        <div className="contato">

          <p>
            <FaEnvelope style={{ marginRight: 8 }} />
            {email}
          </p>

          <p>
            <FaPhone style={{ marginRight: 8 }} />
            {telefone}
          </p>

        </div>
      )}
      
      <div className="competencias">

        <h4>Competências</h4>

        <div className="skills">
          <span>React</span>
          <span>JavaScript</span>
          <span>CSS</span>
        </div>

      </div>

    </div>
  );
}

export default BusinessCard;