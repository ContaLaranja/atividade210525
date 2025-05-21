import { useNavigate } from 'react-router-dom'
import './styles.css'

function Home() {
  const navigate = useNavigate()
  return (
    <div className="pagina-home">
      <div className="container">
        <h1>Bem-vindo</h1>
        <button onClick={() => navigate('/cadastro')}>Ir para Cadastro de Jogadores</button>
      </div>
    </div>
  )
}

export default Home