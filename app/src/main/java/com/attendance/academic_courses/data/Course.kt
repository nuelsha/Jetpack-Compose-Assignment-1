package com.attendance.academic_courses.data

data class Course(
    val id: Int,
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: List<String> = emptyList()
)

// Sample course data
val sampleCourses = listOf(
    Course(
        id = 1,
        title = "Introduction to Computer Science",
        code = "CS101",
        creditHours = 3,
        description = "An introductory course covering the basics of computer science, programming concepts, and problem-solving techniques.",
        prerequisites = listOf("None")
    ),
    Course(
        id = 2,
        title = "Data Structures and Algorithms",
        code = "CS201",
        creditHours = 4,
        description = "A comprehensive study of data structures and algorithms, including arrays, linked lists, trees, graphs, sorting, and searching algorithms.",
        prerequisites = listOf("CS101", "MATH142")
    ),
    Course(
        id = 3,
        title = "Mobile App Development",
        code = "CS350",
        creditHours = 3,
        description = "Learn to develop mobile applications using modern frameworks and tools, with a focus on Android development using Kotlin and Jetpack Compose.",
        prerequisites = listOf("CS201", "CS215")
    ),
    Course(
        id = 4,
        title = "Database Systems",
        code = "CS315",
        creditHours = 3,
        description = "Introduction to database design, implementation, and management. Topics include data modeling, relational databases, SQL, and database administration.",
        prerequisites = listOf("CS201")
    ),
    Course(
        id = 5,
        title = "Artificial Intelligence",
        code = "CS440",
        creditHours = 4,
        description = "Exploration of AI concepts including search algorithms, knowledge representation, machine learning, neural networks, and natural language processing.",
        prerequisites = listOf("CS201", "MATH242", "STAT301")
    ),
    Course(
        id = 6,
        title = "Software Engineering",
        code = "CS330",
        creditHours = 3,
        description = "Study of software development methodologies, project management, requirements analysis, design patterns, testing, and maintenance.",
        prerequisites = listOf("CS201", "CS215")
    ),
    Course(
        id = 7,
        title = "Computer Networks",
        code = "CS425",
        creditHours = 3,
        description = "Fundamentals of computer networking, including network architectures, protocols, routing, and network programming.",
        prerequisites = listOf("CS201", "CS240")
    )
)
