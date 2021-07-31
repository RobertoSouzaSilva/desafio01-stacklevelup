import React from 'react';
import { Link } from 'react-router-dom';
import './index.css'


export default function Header(){
        return(
            <header id="main-header">
                <div className="header-content">
                    <Link to="/">Home</Link>
                    <Link to="/cadastrar-fiscal">CadastrarFiscal</Link>
                    <Link to="/deletar-fiscal">DeletarFiscal</Link>
                    <Link to="/cadastrar-funcao">CadastrarFuncao</Link>
                </div>
            </header>
           
        )
    
}