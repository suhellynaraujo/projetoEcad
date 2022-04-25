import { useEffect, useState } from "react";
import api from "../../server/api";
import "../listadedados/listar.css";

export default function Listar() {
  const [dados, setDados] = useState([]);

  useEffect(() => {
    api
      .get("/dados")
      .then((response) => {
        setDados(response.data);
      })
      .catch((error) => console.log(error));
  }, []);

  
  return (
    <>
      <div className="divInferior">
        <div className="title">
          <h5>Arquivos</h5>
        </div>
        <div className="tabela">
        <table  className="table table-striped table-bordered" >
          <thead className="colunas">
            <tr>
              <th scope="col">Banco</th>
              <th scope="col">Tipo</th>
              <th scope="col">Arquivo</th>
              <th scope="col">Dt. Geração</th>
              <th scope="col">Gerado por</th>
              <th scope="col">Dt. Envio</th>
              <th scope="col">Qtd. Linhas</th>
              <th scope="col">Total</th>
            </tr>
          </thead>
          {dados.map((dados) => (
            <tbody>
              <tr className="tds">
                <td>{dados.banco}</td>
                <td>{dados.tipo}</td>
                <td>{dados.arquivos}</td>
                <td>{dados.dataInicial}</td>
                <td>{dados.nome}</td>
                <td>{dados.dataFinal}</td>
                <td>{dados.linhas}</td>
                <td>{dados.total}</td>
              </tr>
            </tbody>
          ))}
        </table>  
        </div>              
      </div>
    </>
  );
}
