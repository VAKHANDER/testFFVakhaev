Было добавлено 3 класса:
1. Coordinate
2. FindIslandsUseCase
3. FindIslandsUseCaseTest

**Класс Coordinate**

Данный класс содержит в себе 2 поля - координаты x и y. Данные поля инициализируются только 1 раз при создании объекта класса в конструкторе, далее можно только получать значения через геттеры. Также переопределены методы
equals & hashCode для правильной работы структур, где используется сравнение элементов и их хэширование.

**Класс FindIslandsUseCase**

Данный класс содержит 1 метод execute, в него передаются размеры поля, которые ввел пользователь и поле в виде двумерного массива char;
Метод позвращает число int - количество островов на карте

**Класс FindIslandsUseCaseTest**

Содержит 1 метод main. 
В первой части метода проводится тестирование функции на примере из файла .rtf. Заготовки для теста вынесены в отдельные константные поля класса. Не стал использовать сторонние библиотеки так как посчитал, что пока на данном этапе этого не требуется. 
Вторая часть метода main позволяет протестировать свое кастомное поле, можно не перезапускать программу для повторного теста функции. Для завершения программы необходимо на этапе ввода размерности поля ввести "-1 -1";

**Оценка временной сложности алгоритма**

Временная сложность алгоритма представляет собой линейную зависимость: 
**O(N x M) или O(k), где k - количество клеток.**
В методе execute осуществляется проход по каждой клетке ровно 1 раз => количество проходов зависит от количества клеток. Даже с учетом вложенного поиска в глубину, гарантируется проход по каждой клетке только один раз, поэтому при возвращении в глобальный цикл прохода
по полям клетки, которые уже были посещены, рассматриваться не будут;

**Пример выполнения программы:**

**Пример 1 (тестовый пример из файла):**

![image](https://github.com/user-attachments/assets/d839d717-d25a-471e-a2f9-533291246f32)

**Пример 2:**

![image](https://github.com/user-attachments/assets/47182cd4-116c-4986-9fff-eaa5ddf79e68)
