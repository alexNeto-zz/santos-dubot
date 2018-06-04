[![Codacy Badge](https://api.codacy.com/project/badge/Grade/ff7ef076304e4d20941e28f022207eae)](https://app.codacy.com/app/alexNeto/santos-dubot?utm_source=github.com&utm_medium=referral&utm_content=alexNeto/santos-dubot&utm_campaign=badger)
[![Build Status](https://travis-ci.org/alexNeto/santos-dubot.svg?branch=master)](https://travis-ci.org/alexNeto/santos-dubot)


Projeto desenvolvido como trabalho para a cadeira de Engenharia de Software III da FATEC de São José dos Campos por @alexNeto, @guigaexe e @GrandeLepe

# santos-dubot

* baixe ou clone
* renomeie a iterface `Info_example.java` para `Info.java`
* adicione a variavel `Info.token` o seu token do telegram
* no terminal rode `$ gradle serve`


# Sobre: 
O bot se destina a fazer consultas automatizadas no https://www.redemet.aer.mil.br/ de **TAF**(**T**erminal **A**erodrome **F**orecast) **METAR** (**MET**eorological **A**erodrome **R**eport) e **Aviso de Aeródromo**.

# Funcionamento:

## Telas do bot:

#### Primeira interação:

>Primeira interação com o usuario;

<img src="Figures/inicio.jpg" width="200">


#### Solicitando o Aviso de Aeródromo:
>Usuario entrando com um código ICAO e solicitando o Aviso de Aeródromo;

<img src="Figures/aviso.jpg" width="200">


#### Solicitando o TAF:
>Usuario entrando com um código ICAO e solicitando o TAF;

<img src="Figures/taf.jpg" width="200">

#### Solicitando o METAR:
>Usuario entrando com um código ICAO e solicitando o METAR;

<img src="Figures/metar.jpg" width="200">

#### Solicitando o todos os dados:
>Com o intuito de otimizar a interaçãodo bom com o usuario ele pode fazer o pedido de todas as informações de uma unica vez;

<img src="Figures/todos.jpg" width="200">


# Diagrama de Classes do Sistema:

![description](Figures/mvc.jpg)
