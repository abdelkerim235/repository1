def equal_to_avg(arr):
    # Вычисляем среднее арифметическое всех элементов массива
    avg = sum(arr) / len(arr)

    # Проверяем, есть ли хотя бы один элемент, равный среднему арифметическому
    for num in arr:
        if num == avg:
            return True

    # Если цикл завершился, и такой элемент не найден, возвращаем False
    return False

# Пример использования:
result1 = equal_to_avg([1, 2, 3, 4, 5])    # Должно вернуть True
result2 = equal_to_avg([1, 2, 3, 4, 6])    # Должно вернуть False

print(result1)
print(result2)
