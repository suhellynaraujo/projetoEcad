import '../filtodepesquisa/filtro.css';
import Lupa from "../../assets/img/lupa.svg";
import Lixo from "../../assets/img/lixo.svg";
import Calendario from "../../assets/img/calendar3.svg"

export default function Filtro() {
  return (
    <>
      <div className="divSuperior">
        <div className="filtroDePesquisa">
          <img src={Lupa} className="lupa" alt="pesquisar"/>
          <h5>Filtro de Pesquisa</h5>
        </div>

        <div className="inserirDados">
          <form className="formularioDados">
            <div className="center">
            <label >             
              Nome
              <input type="text" id="name" name="nome" />
            </label>
            </div>
            <div className="divData">
              <label>              
                Data Inicial:
                <input type="text" id="dataInicial" name="dataInicial" />
                <img src={Calendario} className="calendario" alt="calendario"/>
              </label>
              <label>
                Data Final:
                <input type="text" id="dataFinal" name="dataFinal" />
                <img src={Calendario} className="calendario" alt="calendario"/>
              </label>
            </div>
            <div className="center">            
              <label>           
              Arquivo:
              <select>
                <option value="todos">TODOS</option>
                <option value="tipo">TIPO</option>
                <option value="arquivo">ARQUIVO</option>
                <option value="dataInicial">DATA INICIAL</option>
                <option value="dataFinal">DATA FINAL</option>
                <option value="total">TOTAL</option>
              </select>
            </label>
            </div>
          </form>
        </div>

        <div className="botoes">
          <button className="btn">
          <img src={Lupa} className="lupa" alt="pesquisar"/>
            Pesquisar</button>
          <button className="btn">
            <img src={Lixo} className="lixo" alt="excluir"/>
            Limpar</button>
        </div>
      </div>
    </>
  );
}
