http://localhost:8765/{service-name}/{url}
e.g. http://localhost:8765/CURRENCY-EXCHANGE-SERVICE/currency-exchange/from/USD/to/CNY
(localhost:8000/currency-exchange/from/USD/to/CNY)



Initial (uppercase is from naming-server)

- http://localhost:8765/CURRENCY-EXCHANGE-SERVICE/currency-exchange/from/USD/to/CNY

- http://localhost:8765/CURRENCY-CONVERSION-SERVICE/currency-converter/from/USD/to/CNY/quantity/10


Lower Case (if spring.cloud.gateway.discovery.locator.lowercaseServiceId=true)

- http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/CNY

- http://localhost:8765/currency-conversion-service/currency-converter/from/USD/to/CNY/quantity/10


Custom Routes

- http://localhost:8765/currency-exchange/from/USD/to/CNY
