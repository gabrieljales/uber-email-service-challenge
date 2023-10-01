# Desafio backend - serviço de email
Esse repositório contém a resolução de um coding challenge da Uber, que pode ser [encontrado nesse repositório](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md#email-service) e foi resolvido em [vídeo](https://www.youtube.com/watch?v=eFgeO9M9lLw), pela Fernanda Kipper.
O objetivo desse projeto é aprimorar os meus conhecimentos em Java, Spring e arquitetura limpa.

## Camadas
* **Core:** É a camada central que reune as regras de negócio e os casos de uso da aplicação. Os casos de uso definem o quê o nosso app faz, mas não como ele faz. Essa camada não conhece nenhuma outra camada, por se tratar do núcleo.
* **Application:** Contém a implementação dos casos de uso. A camada application só conhece a camada core, ou seja, só implementa as interfaces da camada central (conhece somente a abstração).
* **Adapters:** A camada de interface adapters adaptam o mundo externo para uma ‘interface’, fazendo com que a aplicação dependa da interface e não de uma implementação externa.
* **Infra:** A camada de infraestrutura é responsável por interagir com serviços externos.
* **Controllers:** Essa camada é responsável por receber e processar as solicitações HTTP, rotear essas solicitações para os casos de uso apropriados e retornar as respostas adequadas aos clientes.