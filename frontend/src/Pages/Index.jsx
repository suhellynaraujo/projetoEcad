import React from "react";
import Filtro from "../components/filtodepesquisa/filtro";
import Listar from "../components/listadedados/listar";
import '../Pages/indexpages.css'

export default function Index() {
  return (
    <>    
      <main className="principal">
      <Filtro/>
       <Listar/>
      </main>
    </>
  );
}
