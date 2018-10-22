# CIS2323_Week08_Homework2

 throw - это служебное слово, которое означает, что в этом месте мы throw exception. 
 когда мы его throw - программа прекращает работу именно в этом месте и ищет обработчик (catch), чтобы его (exception) перехватить и обработать. Если обработчик находится - он вызывается, если нет - исключение передается выше по стеку (т.е. в метод, из которого был вызван текущий метод). 
 Throw можно исключения разных типов, мы создали (new) исключение типа IllegalArgumentException и передали в его конструктор строку "Cannot move out of board!" 
 В самом методе move обработчика нет, поэтому программа прервет работу и передаст исключение выше по стеку в метод main. - А вот в нем у нас есть обработчик (catch), поскольку место, откуда выскакивает исключение у нас огорожено try{    }, а catch(){} и есть наш обработчик и будет вызвано для исполнения содержимое фигурных скобок catch.., 
 Но вызвано оно будет не всегда, а только если мы перехватываем исключение того же или производного типа. В нашем случае мы ловим тип Exception, а поскольку от него происходят и должны происходить все другие типы Exception (наш IllegalArgumentException в их числе), мы его тоже поймаем и даже воспользуемся его содержимым, которое мы сами в него запихали "Cannot move out of board!". 
 Исключения могут выбрасываться не только нашими, но и библиотечными методами, поэтому, надо внимательно смотреть на декларацию метода и, если он содержит в заголовке throws, обязательно его ограждать try-catch (только его одного или вместе с другими методами, если они могут генерить исключения.)
