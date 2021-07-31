import React, {Component} from 'react';
import axios from 'axios';


export default class CadastrarFiscal extends Component{
    constructor(props){
        super(props);
        this.state={
            nome: '',
            cpf: '',
            telefone: '',
            email: '',
            tempoExpericencia: '',
            funcaoPretendida: ''
        }
    }

    handleSubmit = event => {
        event.preventDefault();
        const fiscal = {
            nome: this.state.nome,
            celular: this.state.celular,
            cpf: this.state.cpf,
            email: this.state.email,
            tempoExpericencia: this.state.tempoExpericencia,
            funcaoPretendida: this.state.funcaoPretendida
        };

        axios.post(`http://localhost:8080/fiscais`, fiscal)
        .then(res => {
            console.log(res);
            console.log(res.data);
        })
    }

    render(){
        return(    
            <div>
            <h1>Cadastrar Fiscal</h1>
            <form onSubmit={this.handleSubmit}>
                <div>
                    <label>Nome: </label>
                    <input type="text" name="nome" value={this.state.nome} onChange={(text) => this.setState({nome: text.target.value})}></input>
                    <br/>
                    <br/>
                    <label>CPF: </label>
                    <input type="text" name="cpf" value={this.state.cpf} onChange={(text) => this.setState({cpf: text.target.value})}></input>
                    <br/>
                    <br/>
                    <label>Celular: </label>
                    <input type="text" name="telefone" value={this.state.telefone} onChange={(text) => this.setState({telefone: text.target.value})}></input>
                    <br/>
                    <br/>
                    <label>Email: </label>
                    <input type="text" name="email" value={this.state.email} onChange={(text) => this.setState({email: text.target.value})}></input>
                    <br/>
                    <br/>
                    <label>Tempo de experiência: </label>
                    <input type="text" name="tempoExpericencia" value={this.state.tempoExpericencia} onChange={(text) => this.setState({tempoExpericencia: text.target.value})}></input>
                    <br/>
                    <br/>
                    <label>Função Pretendida: </label>
                    <input type="text" name="funcaoPretendida" value={this.state.funcaoPretendida} onChange={(text) => this.setState({funcaoPretendida: text.target.value})}></input>
                    <br/>
                    <br/>
                    <button type="submit">Cadastrar</button>
                </div>
            </form>
        </div>
        )
    }
}