1. Почему использование тестовых заглушек может быть полезным 
при написании модульных тестов?

Тестовые заглушки могут быть полезны, так как позволяют проверить часть кода, 
зависимого от другого кода. Мы можем использовать заглушку на ту часть кода,
которая в данный момент нам не интересна, таким образом мы изолируем зависимость
и можем быть уверены, что проверяем код, который интересен нам в данный момент

2.  Какой тип тестовой заглушки следует использовать, если вам нужно 
проверить, что метод был вызван с определенными аргументами? 

Для этого используются МОКИ, моки - это классы-заглушки, которые используются 
именно для того, чтобы проверить что определенная функция была вызвана с
определенными аргументами.

3. Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное
   значение или исключение в ответ на вызов метода? 
Для того, чтобы вернуть готовые ответы  используют STUB-заглушки, они возвращают
   предопределённое значение. Это готовые ответы на вызовы, сделанные во время
   теста, обычно вообще не реагируя ни на что, кроме того, что запрограммировано
   для теста. Заглушка всегда будет возвращать значение, переданное в конструкторе, у нас есть
   полный контроль над заглушкой, и она полностью изолирована от
   производственного кода.
MOCK-также можно использовать, МОКИ помогают эмулировать и проверять выходные взаимодействия —
   то есть вызовы, совершаемые тестируемой системой к её зависимостям для
   изменения их состояния. Они могут выдавать исключение, если получают вызов,
   которого не ожидают
4. Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или 
базой данных?
Предполагаю, что для решения этого вопроса лушче всего подойдут Fake или подделки.
   Fake используется, чтобы запускать тесты быстрее. Это замена
   тяжеловесного внешнего зависимого объекта легковесной реализацией.






