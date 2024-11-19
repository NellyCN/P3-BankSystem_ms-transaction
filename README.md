# Proyect 3 - Sistema Gestión de Transacciones Bancarias

## 1. Diagrama de Componentes - Arquitectura de Microservicio mstransactions

![XYZBankSystem_Components Diagram_MsTransaction.jpg](src%2Fimgs%2FXYZBankSystem_Components%20Diagram_MsTransaction.jpg)

## 2. Diagrama de Secuencia - Flujo de Comunicación mstransactions

![XYZBankSystem_SecuenceDiagram_Transactions.jpg](src%2Fimgs%2FXYZBankSystem_SecuenceDiagram_Transactions.jpg)

## 3. Requisitos Funcionales

### 3.1 Funcionalidades del Sistema

+ El sistema permite **Registrar Depósitos**.
+ El sistema permite **Registrar Retiros**.
+ El sistema permite **Registrar Transferencias entre cuentas**.
+ El sistema al realizar **transferencias** permite **escoger cuenta de origen y cuenta de destino**.
+ El sistema permite **Consultar historial de Transacciones**.

### 3.2 Reglas del Negocio - Validaciones de Transacciones:

+ Los depósitos y retiros se aplican a cuentas
+ Las transferencias requieren que se indique la cuenta de destino y el monto.
+ No se pueden realizar retiros o transferencias si el saldo disponible es insuficiente.

### 3.3 Herramientas

+ Aplicación de diagramas UMl, Drawio
+ Java 17
+ IntelliJ IDEA
+ Maven
+ MongoDB
+ Postman

## 4. Ejecución

Ejecutar proyecto en el IDE y postman.


## 4. MongoDB
![MongoDB_allTransactions.png](src%2Fimgs%2FMongoDB_allTransactions.png)
![PorCtaDestino.png](src%2Fimgs%2FPorCtaDestino.png)![PorTipoesDeposito.png](src%2Fimgs%2FPorTipoesDeposito.png)
![PorTipoyCtaDestino.png](src%2Fimgs%2FPorTipoyCtaDestino.png)

## 5. Postman
![HistorialTransactions.png](src%2Fimgs%2FHistorialTransactions.png)
