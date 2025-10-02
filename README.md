# Brain Games

Коллекция консольных игр для тренировки мозга.

### Hexlet tests and linter status:
[![Actions Status](https://github.com/DmitriyTokarev96/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/DmitriyTokarev96/java-project-61/actions)

### Code Quality:
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=DmitriyTokarev96_java-project-61&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=DmitriyTokarev96_java-project-61)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=DmitriyTokarev96_java-project-61&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=DmitriyTokarev96_java-project-61)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=DmitriyTokarev96_java-project-61&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=DmitriyTokarev96_java-project-61)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=DmitriyTokarev96_java-project-61&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=DmitriyTokarev96_java-project-61)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=DmitriyTokarev96_java-project-61&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=DmitriyTokarev96_java-project-61)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=DmitriyTokarev96_java-project-61&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=DmitriyTokarev96_java-project-61)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=DmitriyTokarev96_java-project-61&metric=bugs)](https://sonarcloud.io/summary/new_code?id=DmitriyTokarev96_java-project-61)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=DmitriyTokarev96_java-project-61&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=DmitriyTokarev96_java-project-61)

## Описание

Brain Games — это набор из пяти консольных игр, построенных по принципу популярных мобильных приложений для прокачки мозга. Каждая игра задает вопросы, на которые нужно дать правильные ответы. После трех правильных ответов считается, что игра пройдена. Неправильные ответы завершают игру и предлагают пройти ее заново.

## Установка

```bash
git clone https://github.com/DmitriyTokarev96/java-project-61.git
cd java-project-61/app
make build
```

## Запуск

```bash
make run-dist
```

## Доступные игры

### 1. Greet (Приветствие)
Простое приветствие пользователя.

### 2. Even (Проверка на четность)
Определите, является ли данное число четным.

**Правила:** Ответьте 'yes', если число четное, или 'no', если нечетное.

## Демонстрация игр

### Примеры игры "Even" (победа и поражение):

![Демонстрация игры Even - победа и поражение](app/screenshots/Снимок%20экрана%202025-10-02%20164614.png)

## Как добавить скриншот в README

Для добавления скриншота в README.md файл:

1. **Создайте скриншот** игры в действии
2. **Сохраните изображение** в папку проекта (например, в `screenshots/` или `images/`)
3. **Добавьте изображение в README** используя markdown синтаксис:

```markdown
![Описание скриншота](путь/к/изображению.png)
```

### Примеры добавления скриншотов:

```markdown
## Демонстрация

### Успешное прохождение игры "Even"
![Победа в игре Even](screenshots/even-game-win.png)

### Неудачное прохождение игры "Even"  
![Поражение в игре Even](screenshots/even-game-lose.png)
```

### Альтернативный способ с ссылкой:

```markdown
[![Демонстрация игры](screenshots/demo.png)](screenshots/demo.png)
```

### Если изображение находится в интернете:

```markdown
![Демонстрация](https://example.com/path/to/image.png)
```

**Рекомендации:**
- Используйте форматы PNG или JPG
- Оптимизируйте размер изображений (не более 1-2 МБ)
- Добавляйте описательный alt-текст
- Создайте отдельную папку `screenshots/` для организации изображений