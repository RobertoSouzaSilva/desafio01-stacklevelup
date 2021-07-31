import React, {Component} from 'react';
import axios from 'axios';


export default class Home extends Component{
    constructor(props){
        super(props);
        this.state={
            fiscais:[],
            message: null,
        }
    }

    componentDidMount(){
        axios.get(`http://localhost:8080/fiscais`)
        .then(res => {
            const fiscais = res.data;
            this.setState({fiscais});
        })
    }

    render(){
        return(    
            <div>
                <h1>Bem vindo a home</h1>
                <div className="container">
                    <h3>Todos os alunos cadastrados</h3>
                    <table className="table">
                        <thead>
                            <tr>
                                <td>Código do fiscais</td>
                                <td>CPF</td>
                                <td>Telefone</td>
                                <td>nome</td>
                                <td>tempoExpericencia</td>
                                <td>funcaoPretendida</td>
                                <td>email</td>
                            </tr>
                        </thead>
                        <tbody>
                            {this.state.fiscais.map(fiscal =>
                                 <tr key={fiscal.codigo}>
                                     <td>{fiscal.cpf}</td>
                                     <td>{fiscal.telefone}</td>
                                     <td>{fiscal.nome}</td>
                                     <td>{fiscal.tempoExpericencia}</td>
                                     <td>{fiscal.funcaoPretendida}</td>
                                     <td>{fiscal.email}</td>
                                 </tr>
                                 )}
                        </tbody>
                    </table>

                  
                </div>
            </div>
        )
    }
}