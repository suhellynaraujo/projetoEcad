import { useEffect, useState } from "react"
import api from "../../server/api"

export default function Listar() {

const [dados, setDados] = useState([])

useEffect(() => {
    api.get('/dados')
    .then((response) =>{
        setDados(response.data)
    })
    .catch((error) => console.log(error))
}, [])

    return(
        <>
        <div className="divInferior">
            {dados.map((dados) =>(
                
            ))}
            
        </div>
        </>
    )
}