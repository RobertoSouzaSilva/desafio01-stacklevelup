import React, {Component} from 'react';
import axios from 'axios';


export default class DeletarFiscal extends Component{
    constructor(props){
        super(props);
        this.state={
            codigo: 0
        }
    }

    handleSubmit = event => {
        axios.delete(`http://localhost:8080/fiscais/${this.state.codigo}`)
        .then(res => {
            console.log(res);
            console.log(res.data);
        });
    }

    render(){
        return(    
            <div>
            <h1>Deletar fiscal</h1>
            <form onSubmit={this.handleSubmit}>
                <label>Código do fiscal</label>
                <input type="text" name="codigo" value={this.state.codigo} onChange={(text) => this.setState({codigo: text.target.value})}/>
                <button type="submit">Deletar</button>
            </form>
        </div>
        )
    }
}