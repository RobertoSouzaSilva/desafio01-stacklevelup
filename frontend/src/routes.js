import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import Header from './components/Header';
import Home from './pages/Home';
import CadastrarFiscal from './pages/CadastrarFiscal';
import DeletarFiscal from './pages/DeletarFiscal';
import CadastrarFuncao from './pages/CadastrarFuncao';

export const Routes = () => {
    return(
        <BrowserRouter>
            <Header/>
            <Switch>
                <Route exact path="/" component={Home}/>
                <Route path="/cadastrar-fiscal" component={CadastrarFiscal}/>
                <Route path="/deletar-fiscal" component={DeletarFiscal}/>
                <Route path="/cadastra-funcao" component={CadastrarFuncao}/>
            </Switch>
        </BrowserRouter>
    );
}

