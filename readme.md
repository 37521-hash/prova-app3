Grupo: Murilo Dias Olivera Neto, Miguel Oliveira Martins e Gabriel do Santos Custódio

Link do claude: https://claude.ai/share/1a0a3975-25bb-4485-8107-30d42b93505b

Respostas dissertativas:

1-Por que não dá para criar um Veiculo diretamente, e por que isso faz sentido para uma locadora?

Porque a classe Veiculo é abstrata. Na vida real, a locadora não aluga um "veículo genérico", mas sim um modelo específico (como um carro ou uma moto). A classe serve apenas como uma base para organizar o código, impedindo que algo indefinido seja criado.

2-Num único laço, o programa calcula o aluguel de carro, moto e carro elétrico sem saber qual é qual. Como isso funciona e qual é o nome desse conceito?

Isso acontece graças ao polimorfismo. O laço chama o método calcularAluguel de forma genérica para cada item da lista, mas o Java descobre automaticamente qual é o objeto real em tempo de execução e executa a regra de cálculo certa para cada um, sem precisar de filtros ou if/else.

3-Por que o cálculo de recarga está numa interface e não na classe Veiculo? O que daria errado se estivesse lá?

Porque a recarga é uma característica exclusiva dos carros elétricos, e não de todos os veículos. Se estivesse na classe base Veiculo, obrigaria motos e carros comuns a carregarem um comportamento que não faz sentido para eles, poluindo a estrutura e quebrando a regra de que veículos tradicionais não têm recarga.

