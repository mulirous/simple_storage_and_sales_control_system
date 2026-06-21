<h1 align="center">
Universidade Federal do Rio Grande do Norte
</h1>

**Disciplina**: DIM0501 — Boas Práticas de Programação

**Tema**: Identificação, classificação e priorização de dívida técnica

**Semestre**: 2026.1

---

# 1. Identidade do Grupo
**Integrantes**:
- Integrante 1: [Murilo Costa](https://github.com/mulirous)

**Linguagem Utilizada**: Java

**Link do Repositório Git**: https://github.com/mulirous/simple_storage_and_sales_control_system

# 2. Descrição do Sistema
O sistema em questão é um Sistema de Controle de Estoque e Vendas, desenvolvido para a o registro de vendas, cadastro de
itens no estoque, listagem do estoque e sinalização de estoque baixo. O sistema é implementado em Java e pode ser utilizado
em diversos contextos comerciais para facilitar a gestão de produtos e vendas, como em lojas, farmácias, ou qualquer
estabelecimento que necessite de controle de estoque e vendas.

# 3. Inventário e Classificação de Dívida Técnica

| ID  | Localização                | Descrição                                                                                                                                                                   | Tipo de Dívida        | Esforço | Impacto | Custo |
|-----|----------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------|---------|---------|-------|
| D1  | Linha 1-3                  | Comentários de versionamento e de autoria pouco explicativos e sem padrão                                                                                                   | Documentação          | 1       | 1       | 1     |
| D2  | Linha 10                   | Senha de acesso hardcoded                                                                                                                                                   | Configuração          | 2       | 5       | 5     |
| D3  | Linha 13                   | Nome de variável pouco descritiva e comentário explicando o nome em seguida                                                                                                 | Código e Documentação | 1       | 2       | 2     |
| D4  | Linha 15-19                | Classe estática dentro de outra classe, dificultando a leitura e manutenção                                                                                                 | Arquitetura           | 3       | 3       | 2     |
| D5  | Linha 21                   | Comentário explicando método autoexplicativo                                                                                                                                | Documentação          | 1       | 1       | 1     |
| D6  | Linha 22                   | Nome de método pouco descritivo, justificando o comentário acima e nome de parametros nada descritivos dependendo da interpretação do leitor                                | Código e Documentação | 1       | 2       | 2     |
| D7  | Linha 22-30                | Método que mistura lógica com I/O, acumulando responsabilidades desnecessárias                                                                                              | Código                | 3       | 3       | 4     |
| D8  | Linha 32-52                | Método longo, misturando lógica de negócio de desconto, I/O e manipulação de dados, acumulando responsabilidades desnecessárias e dificultando a manutenção                 | Código                | 4       | 4       | 5     |
| D9  | Linha 54                   | Comentário explicando método autoexplicativo                                                                                                                                | Documentação          | 1       | 1       | 1     |
| D10 | Linha 56-60                | Nome de variável pouco descritiva para o contexto                                                                                                                           | Código                | 1       | 2       | 2     |
| D11 | Linha 74/56/39/40/46/57/58 | Número hardcoded para limite de estoque baixo e comentário explicando o número                                                                                              | Código e Documentação | 2       | 2       | 1     |
| D12 | Linha 81-90                | Código morto remanescente de uma implementação anterior, sem utilidade                                                                                                      | Código Morto          | 1       | 1       | 1     |
| D13 | Linha 92-94                | Método não implementado com comentário requisitando a implementação                                                                                                         | Marcadores            | 5       | 1       | 2     |
| D14 | Linha 96-134               | Método longo com muita repetição de código                                                                                                                                  | Código                | 5       | 4       | 5     |
| D15 | Linha 8-135                | Classe longa com muitas responsabilidades, misturando lógica de negócio, I/O e manipulação de dados, dificultando a manutenção e evolução do sistema                        | Código e Arquitetura  | 5       | 5       | 5     |
| D16 | N/A                        | Falta de testes automatizados, dificultando a identificação de falhas e a evolução do sistema                                                                               | Testes                | 5       | 5       | 5     |
| D17 | Linha 38-42/54-60          | Regra de desconto inconsistente, onde em vender() usa 10% acima de 100R$ e calcular_total() acima de 200R$                                                                  | Código                | 3       | 4       | 4     |
| D18 | Linha 46                   | return 0 quando não houver estoque para venda, falhando silenciosamente e não explicando o motivo                                                                           | Robustez              | 2       | 4       | 5     |
| D19 | Linha 32-52                | Produtos duplicados passam na verificação para a venda ser realizada, podendo causar problemas de estoque e vendas                                                          | Robustez              | 5       | 4       | 5     |
| D20 | Linha 22-30                | Método add() permite a duplicação de produtos no estoque, causando problemas de estoque e vendas                                                                            | Robustez              | 5       | 4       | 5     |
| D21 | Linha 12-13                | Estados globais mutáveis para produtos e histórico de vendas podendo causar problemas                                                                                       | Arquitetura           | 5       | 4       | 5     |
| D22 | Linha 13                   | hist é uma variável global preenchida porém não utilizada, apenas consumindo memória, podendo ser considerada código morto                                                  | Arquitetura           | 1       | 1       | 1     |
| D23 | Linha 96-134               | Método sem validação de entrada, permitindo a inserção de dados inválidos e causando possíveis falhas ou comportamentos inesperados e variáveis com nomes pouco descritivos | Robustez e Código     | 2       | 5       | 5     |
| D24 | Linha 53-60                | Método morto que não é utilizado em nenhum lugar do código, com duplicação de lógica, podendo ser refatorado para um somente                                                | Código                | 4       | 3       | 4     |

# 4. Matriz de Priorização

Considerando o esforço de 1-2 como baixo e 3-5 como alto, e o impacto de 1-2 como baixo e 3-5 como alto, a matriz de priorização é a seguinte:

|                | Esforço Baixo                          | Esforço Alto                                       |
|----------------|----------------------------------------|----------------------------------------------------|
| Impacto Baixo  | D1, D3, D5, D6, D9, D10, D11, D12, D22 | D13                                                |
| Impacto Alto   | D18, D2, D23                           | D4, D7, D8, D14, D15, D16, D17, D19, D20, D21, D24 |

Ordem de prioridade:

- Prioridade 1: D18, D2, D23;
- Prioridade 2: D4, D7, D8, D14, D15, D16, D17, D19, D20, D21, D24;
- Prioridade 3: D1, D3, D5, D6, D9, D10, D11, D12, D22;
- Prioridade 4: D13.

O critério de priorização é categórico, onde as dívidas técnicas de alto impacto e baixo esforço são priorizadas para serem quitadas primeiro, seguidas pelas dívidas de alto impacto e alto esforço, depois as dívidas de baixo impacto e baixo esforço, e por último as dívidas de baixo impacto e alto esforço. Essa abordagem visa maximizar o retorno sobre o investimento ao abordar primeiro as dívidas que têm um grande impacto no sistema com um esforço relativamente baixo.

# 5. Roadmap de Quitação de Dívida Técnica

#### **Pagar Agora**: 

- D18: alterar o método de venda para lançar uma explicação no CLI para indicar a falta de estoque, em vez de retornar 0 silenciosamente. É baixo esforço e tem um grande impacto na robustez do sistema.
- D2: remover senha hardcoded, utilizando uma configuração externa ou um sistema de autenticação mais seguro. É baixo esforço e evita um grande risco de segurança.
- D23: adicionar validação de entrada no método de cadastro, garantindo que os dados inseridos sejam válidos e evitando falhas ou comportamentos inesperados e inserindo nomes descritivos para as variáveis. É baixo esforço e tem um grande impacto na robustez do sistema.
- D3: renomear a variável para um nome mais descritivo, eliminando a necessidade do comentário explicativo. É um esforço baixo, mas melhora a legibilidade do código.
- D5: remover o comentário explicativo, já que o método é autoexplicativo, e garantir que o nome do método seja claro o suficiente para transmitir sua função. É um esforço baixo, mas melhora a documentação do sistema.
- D6: renomear o método para um nome mais descritivo, eliminando a necessidade do comentário explicativo, e renomear os parâmetros para nomes mais descritivos. É um esforço baixo, mas melhora a legibilidade do código.
- D17, D24 e D9: refatorar o método calcula_total() com uma regra de desconto unificada, garantindo que a mesma lógica seja aplicada tanto para vender() quanto para o relatório, não dependendo de comentário para explicação de uso. É um esforço alto, mas melhora a consistência e confiabilidade do sistema.
- D10: renomear a variável para um nome mais descritivo, eliminando a necessidade do comentário explicativo. É um esforço baixo, mas melhora a legibilidade do código.
- D11: substituir os números hardcoded para o limite de estoque baixo, limite de desconto de venda e relatório, percentuais de desconto e para identificação de venda não realizada por uma constante ou configuração, eliminando a necessidade do comentário explicativo. É um esforço baixo, mas melhora a manutenção do sistema.

#### **Pagar Depois**: 

- D4: refatorar a classe para separar as responsabilidades, movendo a classe estática para um arquivo separado e organizando o código de forma mais clara. É um esforço alto, mas melhora a arquitetura do sistema.
- D7: refatorar o método para separar a lógica de negócio, I/O e manipulação de dados em métodos distintos, seguindo o princípio de responsabilidade única. É um esforço alto, mas melhora a manutenção e evolução do sistema.
- D8: refatorar o método para separar a lógica de negócio de desconto, I/O e manipulação de dados em métodos distintos, seguindo o princípio de responsabilidade única. É um esforço alto, mas melhora a manutenção e evolução do sistema.
- D14: refatorar o método para reduzir a repetição de código, utilizando loops ou métodos auxiliares para evitar a duplicação. É um esforço alto, mas melhora a manutenção e evolução do sistema.
- D15: refatorar a classe para reduzir o acúmulo de responsabilidades, separando a lógica de negócio, I/O e manipulação de dados em classes distintas, seguindo o princípio de responsabilidade única. É um esforço alto, mas melhora a manutenção e evolução do sistema.
- D16: implementar testes automatizados para as funcionalidades principais do sistema, garantindo a identificação de falhas e facilitando a evolução do sistema. É um esforço alto, mas melhora a qualidade e confiabilidade do sistema.
- D17: refatorar a regra de desconto para ser consistente entre os métodos de venda e cálculo total, garantindo que a mesma lógica seja aplicada em ambos os casos. É um esforço alto, mas melhora a consistência e confiabilidade do sistema.
- D19: adicionar uma verificação para evitar a venda de produtos duplicados, garantindo que o estoque e as vendas sejam gerenciados corretamente. É um esforço alto, mas melhora a robustez do sistema.
- D20: refatorar o método add() para evitar a duplicação de produtos no estoque, garantindo que o estoque seja gerenciado corretamente. É um esforço alto, mas melhora a robustez do sistema.
- D21: refatorar o código para eliminar estados globais mutáveis, utilizando estruturas de dados locais ou classes para gerenciar o estado de produtos e histórico de vendas. É um esforço alto, mas melhora a arquitetura e robustez do sistema.

#### **Conviver conscientemente**: 

- D1: manter os comentários de versionamento e autoria, mas padronizá-los e torná-los mais explicativos, indicando claramente a função do código e as mudanças realizadas. É um esforço baixo, mas melhora a documentação do sistema.
- D12: remover o código morto, garantindo que o código seja limpo e fácil de entender. É um esforço baixo, mas melhora a manutenção do sistema.
- D22: remover a variável global hist, já que ela não é utilizada e apenas consome memória, garantindo que o código seja limpo e fácil de entender. É um esforço baixo, mas melhora a manutenção do sistema.
- D13: implementar o método requisitado, garantindo que a funcionalidade seja completa e o sistema funcione conforme esperado. É um esforço alto, mas melhora a funcionalidade do sistema.

# 6. Itens Quitados (Antes vs Depois)

### Item D3

**Antes**: 

```java
    static ArrayList<String> hist = new ArrayList<>();  // historico
```

**Depois**:

```java
    static ArrayList<String> historicoProdutosCadastrados = new ArrayList<>();
```

**Explicação**: Renomeando a variável para um nome mais descritivo, eliminando a necessidade do comentário explicativo e melhorando a legibilidade do código.

### Item D5

**Antes**:

```java
    // funcao que adiciona produto
    static void add(String n, double p, int q) {
        Produto prod = new Produto();
        prod.nome = n;
        prod.preco = p;
        prod.qtd = q;
        produtos.add(prod);
        hist.add(n);
        System.out.println("Produto adicionado!");
    }
```

**Depois**:

```java
    static void add(String n, double p, int q) {
        Produto prod = new Produto();
        prod.nome = n;
        prod.preco = p;
        prod.qtd = q;
        produtos.add(prod);
        historicoProdutosCadastrados.add(n);
        System.out.println("Produto adicionado!");
    }
```

**Explicação**: Removendo comentário autoexplicativo. O método por si só já indica que adiciona um produto.

### Item D11

**Antes**:

```java
// Calculo de desconto de venda
    if (total > 100) {
        total = total - total * 0.1;
    }
// Calculo de desconto de relatorio
    if (t > 200) {              // limite diferente do usado em vender()
        t = t - t * 0.15;       // desconto diferente do usado em vender()
    }
// Retorno de venda não realizada devido falta de estoque
    System.out.println("Estoque insuficiente");
    return 0;
// Retorno de venda não realizada devido produto não encontrado
    System.out.println("Produto nao encontrado");
    return 0;
// Limite de estoque baixo
    if (produtos.get(i).qtd < 5) {   // estoque baixo
        System.out.println(produtos.get(i).nome + " esta com estoque baixo ("
        + produtos.get(i).qtd + ")");
    }
```

**Depois**:

```java
// Variáveis
static final int LIMITE_ESTOQUE_BAIXO = 5;
static final double VENDA_NAO_REALIZADA = -1.0;
static final double LIMITE_DESCONTO_VENDA = 100;
static final double VALOR_DESCONTO_VENDA = 0.10;
static final double LIMITE_DESCONTO_RELATORIO = 200;
static final double VALOR_DESCONTO_RELATORIO = 0.15;
// Calculo de desconto de venda
    if (total > LIMITE_DESCONTO_VENDA) {
        total = total * (1.0 - VALOR_DESCONTO_VENDA);
    }
// Calculo de desconto de relatorio
    if (t > LIMITE_DESCONTO_RELATORIO) {              // limite diferente do usado em vender()
        t = t * (1 - VALOR_DESCONTO_RELATORIO);       // desconto diferente do usado em vender()
    }
// Retorno de venda não realizada
    return VENDA_NAO_REALIZADA;
// Retorno de venda não realizada
    return VENDA_NAO_REALIZADA;
// Limite de estoque baixo
    if (produtos.get(i).qtd < LIMITE_ESTOQUE_BAIXO) {   // estoque baixo
        System.out.println(produtos.get(i).nome + " esta com estoque baixo ("
        + produtos.get(i).qtd + ")");
    }
```

**Explicação**: Substituindo os números hardcoded para o limite de estoque baixo, limite de desconto de venda e relatório, percentuais de desconto e para identificação de venda não realizada por constantes, eliminando a necessidade do comentário explicativo e melhorando a manutenção do sistema.

### Item D18

**Antes**:

```java
    else if (op.equals("2")) {
        System.out.print("Nome do produto: ");
        String n = sc.next();
                        System.out.print("Quantidade: ");
        int q = Integer.parseInt(sc.next());
        vender(n, q);
    } 
```

**Depois**:

```java
    else if (op.equals("2")) {
        System.out.print("Nome do produto: ");
        String nomeProduto = sc.next();
        System.out.print("Quantidade: ");
        int quantidadeProduto = Integer.parseInt(sc.next());
        double resultado = vender(nomeProduto, quantidadeProduto);
        if (resultado == VENDA_NAO_REALIZADA) {
            System.out.println("Venda nao foi realizada");
        }
    }
```

**Explicação**: Adicionando a quebra de falha silenciosa, lançando uma explicação no CLI para indicar a falta de estoque ou produto não encontrado, em vez de retornar 0 silenciosamente, e renomeando as variáveis para nomes mais descritivos, melhorando a robustez e legibilidade do sistema.

### Item D10

**Antes**:

```java
    // calcula o total de uma compra (usado no relatorio)
    static double calcular_total(double preco, int quantidade) {
        double t = preco * quantidade;
        if (t > 200) {              // limite diferente do usado em vender()
            t = t - t * 0.15;       // desconto diferente do usado em vender()
        }
        return t;
    }
```

**Depois**:

```java
    // calcula o total de uma compra (usado no relatorio)
    static double calcular_total(double preco, int quantidade) {
        double total = preco * quantidade;
        if (total > LIMITE_DESCONTO_RELATORIO) {              // limite diferente do usado em vender()
            total = total * (1 - VALOR_DESCONTO_RELATORIO);       // desconto diferente do usado em vender()
        }
        return total;
    }
```

**Explicação**: Renomeando a variável para um nome mais descritivo, eliminando a necessiade de interpretação do leitor do método.

### Item D9, 17, 24

**Antes**:

```java
    static double vender(String nome, int quantidade) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).nome.equals(nome)) {
                if (produtos.get(i).qtd >= quantidade) {
                    produtos.get(i).qtd = produtos.get(i).qtd - quantidade;
                    double total = produtos.get(i).preco * quantidade;
                    // desconto pra compras grandes
                    if (total > 100) {
                        total = total - total * 0.1;
                    }
                    System.out.println("Venda realizada. Total: " + total);
                    return total;
                } else {
                    System.out.println("Estoque insuficiente");
                    return 0;
                }
            }
        }
        System.out.println("Produto nao encontrado");
        return 0;
    }

    // calcula o total de uma compra (usado no relatorio)
    static double calcular_total(double preco, int quantidade) {
        double t = preco * quantidade;
        if (t > 200) {              // limite diferente do usado em vender()
            t = t - t * 0.15;       // desconto diferente do usado em vender()
        }
        return t;
    }
```

**Depois**:

```java
    static double vender(String nome, int quantidade) {
    for (int i = 0; i < produtos.size(); i++) {
        if (produtos.get(i).nome.equals(nome)) {
            if (produtos.get(i).qtd >= quantidade) {
                produtos.get(i).qtd = produtos.get(i).qtd - quantidade;
                double total = calcular_total(produtos.get(i).preco, quantidade, false);
                System.out.println("Venda realizada. Total: " + total);
                return total;
            } else {
                System.out.println("Estoque insuficiente");
                return VENDA_NAO_REALIZADA;
            }
        }
    }
    System.out.println("Produto nao encontrado");
    return 0;
}

static double calcular_total(double preco, int quantidade, boolean isRelatorio) {
    double total = preco * quantidade;

    if (isRelatorio) {
        if (total > LIMITE_DESCONTO_RELATORIO) {
            total = total * (1 - VALOR_DESCONTO_RELATORIO);
        }
    } else {
        if (total > LIMITE_DESCONTO_VENDA) {
            total = total * (1 - VALOR_DESCONTO_VENDA);
        }
    }

    return total;
}
```

**Explicação**: Refatorando o método vender() para utilizar o método calcula_total() refatorado, para aceitar o calculo de total e aplicação de desconto tanto para quando a venda é realizada quanto para o relatório, garantindo uma regra de desconto consistente entre os métodos, e a retirada de comentários desnecessários para explicação de uso, melhorando a consistência, confiabilidade e legibilidade do sistema. Devido a "grande" refatoração abordar diversas dívidas, elas foram quitadas ao mesmo tempo.

### Item D2:

**Antes**:

```java
    static String SENHA_ADMIN = "1234";  // senha do admin
```

**Depois**:

```java
// config.properties
senha.admin=1234

// Estoque.java
    static final String ARQUIVO_CONFIGURACAO = "config.properties";
    static final String CHAVE_SENHA_ADMIN = "senha.admin";

    static String carregarSenhaAdmin() {
        Properties propriedades = new Properties();

        try (FileInputStream arquivo = new FileInputStream(ARQUIVO_CONFIGURACAO)) {
            propriedades.load(arquivo);
            return propriedades.getProperty(CHAVE_SENHA_ADMIN);
        } catch (IOException e) {
            System.out.println("Erro ao carregar arquivo de configuracao");
            return null;
        }
    }
    
    // Dentro da main()
    else if (op.equals("5")) {
        System.out.print("Senha: ");
        String s = sc.next();
        if (s.equals(carregarSenhaAdmin())) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Senha errada");
        }
    } 
```

**Explicação**: Por questões de segurança, a senha de acesso não deve ser hardcoded no código-fonte. Em vez disso, ela pode ser armazenada em um arquivo de configuração externo, como um arquivo .properties, e carregada dinamicamente pelo sistema. Isso permite que a senha seja alterada sem a necessidade de modificar o código-fonte, reduzindo o risco de exposição acidental da senha e melhorando a segurança do sistema.



# 7. Conclusão