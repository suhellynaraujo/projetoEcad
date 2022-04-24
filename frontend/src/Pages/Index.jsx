export default function Index() {
  return (
    <>
      <main ClassName="principal">
        <div ClassName="divSperior">
          <div ClassName="filtroDePesquisa">
            <h5>Filtro de Pesquisa</h5>
          </div>

          <div ClassName="inserirDados">
            <form>
              <label> Nome
              <input type="text" id="name" name="nome" />
              </label>
              <label> Data Inicial:
              <input type="text" id="dataInicial" name="dataInicial" />
              </label>
              <label>Data Final:
                  <input type="text" id="dataFinal" name="dataFinal" />
              </label>
              <label> Arquivo:
                  <section>
                      <option value="todos">Todos</option>
                  </section>
              </label>
            </form>
          </div>

          <div ClassName="botoes">
              <button>Pesquisar</button>
              <button>Limpar</button>
          </div>
        </div>
        <div className="divInferior"></div>
      </main>
    </>
  );
}
