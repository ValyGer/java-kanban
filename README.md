# java-kanban


# Описание #

Приложение менеджера задач реализован на базе на Java без использования Фреймворков. Проект направлен на ознакомление с основными принципами работы с библиотеками JUnit, GSON и работы RESTful API. 

# Функциональность #

Основная идея проекта заключается в возможности создавать три вида задач: 

1) обычные задачи - Task;
2) большие задачи, включающие в себя другие подзадачи - Epic;
3) подзадачи, входящие в состав больших задач - Subtask.

В приложении реализованы следующие функции: 
* создавать все типы задач,
* удалять все типы задач, 
* обновлять все типы задач, 
* реализованы три типа хранения: 
  * хранение в оперативной памяти;
  * хранение в файле; 
  * хранение на сервере;
* возможность просматривать историю взаимодействия с задачами,
* возможность сортировать данные задачи по приоритету, 
* искать временные пересечения задач (когда одна задача начинается до окончания предыдущей).

В приложении добавлен KVServer с доступом по API токену, который позволяет хранить задачи на удалённом хранилище.

# Технологии #

* Java Core
* JUnit
* GSON
* RESTful API
* Insomnia