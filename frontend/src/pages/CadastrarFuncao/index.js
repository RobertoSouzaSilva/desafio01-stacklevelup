import React, {Component} from 'react';
import axios from 'axios';


export default class CadastrarFuncao extends Component{
    constructor(props){
        super(props);
        this.state={
            nome: '',
            descricao: '',
            sigla: '',

        }
    }

    handleSubmit = event => {
        event.preventDefault();
        const funcao = {
            nome: this.state.nome,
            descricao: this.state.descricao,
            sigla: this.state.sigla,
        };

        axios.post(`http://localhost:8080/funcoes`, funcao)
        .then(res => {
            console.log(res);
            console.log(res.data);
        })
    }

    render(){
        return(    
            <div>
            <h1>Cadastrar Função</h1>
            <form onSubmit={this.handleSubmit}>
                <div>
                    <label>Nome: </label>
                    <input type="text" name="nome" value={this.state.nome} onChange={(text) => this.setState({nome: text.target.value})}></input>
                    <br/>
                    <br/>
                    <label>Descrição: </label>
                    <input type="text" name="descricao" value={this.state.descricao} onChange={(text) => this.setState({descricao: text.target.value})}></input>
                    <br/>
                    <br/>
                    <label>Sigla: </label>
                    <input type="text" name="sigla" value={this.state.sigla} onChange={(text) => this.setState({sigla: text.target.value})}></input>
                    <br/>
                    <br/>
                    <button type="submit">Cadastrar</button>
                </div>
            </form>
        </div>
        )
    }
}