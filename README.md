# Proyect 3 - Sistema Gestión de Transacciones Bancarias

## 1. Diagrama de Componentes - Arquitectura de Microservicio mstransactions

![XYZBankSystem_Components Diagram_MsTransaction.jpg](src%2Fimgs%2FXYZBankSystem_Components%20Diagram_MsTransaction.jpg)

## 2. Diagrama de Secuencia - Flujo de Comunicación mstransactions

![XYZBankSystem_SecuenceDiagram_Transactions.jpg](src%2Fimgs%2FXYZBankSystem_SecuenceDiagram_Transactions.jpg)

## 3. Requisitos Funcionales
+ Uso de OpenAPI (Contract First)
+ Desarrollo del microservicio para la gestión de transacciones.
+ Utilizar MongoDB para almacenar historial de transacciones de los Usuarios.
+ Cada documento representa una transacción con la información correspondiente.
+ Se aplican conceptos de POO, Programación funcional, Programación reactiva (Spring Webflux).
+ El sistema no tiene implementado interfaz gráfica, la verificación de funcionalidades se realizan utilizando Postman.

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

+ Drawio (Diagramas UMl)
+ Java 17
+ IntelliJ IDEA
+ Maven
+ MongoDB
+ Postman

### 3.4 Dependencias
+ Lombok
+ Spring Boot Starter Webflux
+ Spring Boot Starter Data Mongodb Reactive

## 4. Ejecución

Ejecutar proyecto en Postman y mensajes de respuesta en Terminal IDE.


## 4. MongoDB
![MongoDB_allTransactions.png](src%2Fimgs%2FMongoDB_allTransactions.png)
![PorCtaDestino.png](src%2Fimgs%2FPorCtaDestino.png)![PorTipoesDeposito.png](src%2Fimgs%2FPorTipoesDeposito.png)
![PorTipoyCtaDestino.png](src%2Fimgs%2FPorTipoyCtaDestino.png)

## 5. Postman

![RegistroDeposito.png](src%2Fimgs%2FRegistroDeposito.png)
![RegistroRetiro.png](src%2Fimgs%2FRegistroRetiro.png)
![RegistroTransferencia.png](src%2Fimgs%2FRegistroTransferencia.png)
![HistorialTransactions.png](src%2Fimgs%2FHistorialTransactions.png)
![HistorialUltimasTtransacciones.png](src%2Fimgs%2FHistorialUltimasTtransacciones.png)
![RetiroSobreSaldo.png](src%2Fimgs%2FRetiroSobreSaldo.png)
![TransferenciaSobreSaldo1000.png](src%2Fimgs%2FTransferenciaSobreSaldo1000.png)

## 6. Terminal
![RetiroSaldoInsuficiente.png](src%2Fimgs%2FRetiroSaldoInsuficiente.png)
![TransferenciaSaldoInsuficiente.png](src%2Fimgs%2FTransferenciaSaldoInsuficiente.png)