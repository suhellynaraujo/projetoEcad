import "../filtodepesquisa/filtro.css";
import Lupa from "../../assets/img/lupa.svg";
import Lixo from "../../assets/img/lixo.svg";
import Calendario from "../../assets/img/calendar3.svg";
import { useState } from "react";
import api from "../../server/api";

export default function Filtro() {

const [dados, setDados] = useState([]);
    
 const pesquisar = e =>{
    e.preventDefault();
    api
    .get("/dados")
    .then((response) => {
      setDados(response.data);
    })
    .catch((error) => console.log(error));
};
  
  const limpar = event =>{
    event.preventDefault();
  }

  const filtrar = event =>{
    event.preventDefault();
    const banco = dados.filter(dado => dado.banco === banco);
  }

  return (
    <>
      <div className="divSuperior">
        <div className="filtroDePesquisa">
          <img src={Lupa} className="lupa" alt="pesquisar" />
          <h5>Filtro de Pesquisa</h5>
        </div>

        <div className="inserirDados">
          <form className="formularioDados" onSubmit={pesquisar}>
            <div className="center">
              <label>
                Nome
                <input type="text" id="name" name="nome" />
              </label>
            </div>
            <div className="divData">
              <label>
                Data Inicial:
                <input type="text" id="dataInicial" name="dataInicial" />
                <img src={Calendario} className="calendario" alt="calendario" />
              </label>
              <label>
                Data Final:
                <input type="text" id="dataFinal" name="dataFinal" />
                <img src={Calendario} className="calendario" alt="calendario" />
              </label>
            </div>
            <div className="center">             
              <label>
                Arquivo:
                <select name="opcoes" >                 
                  <option value="todos">TODOS</option>
                  <option value={dados.nome}>NOME</option>
                  <option value={dados.dataInicial}>DATA INICIAL</option>
                  <option value={dados.dataFinal}>DATA FINAL</option>
                  <option value={dados.total}>TOTAL</option>
                  <option value={dados.arquivos}>ARQUIVO</option>
                  <option value={dados.tipo}>TIPO</option>
                  <option value={dados.banco}>BANCO</option>
                </select>
              </label>
            </div>
            <div className="botoes">
              <button className="btn" type="submit" onClick={filtrar}>
                <img src={Lupa} className="lupa" alt="pesquisar" />
                Pesquisar
              </button>
              <button className="btn"  type="submit" onClick={limpar}>
                <img src={Lixo} className="lixo" alt="excluir" />
                Limpar
              </button>
            </div>
          </form>
        </div>
      </div>
    </>
  );
}
