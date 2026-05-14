questions = [
    {
        "question" : "1. Which planet is known as the Red Planet?",
        "options"  : ["A.Earth", "B.Mars", "C.Jupiter", "D.Venus"],
        "correct_answer": "B"
    },


    {
        "question": "What is the chemical symbol of Gold?",
        "options": ["A.Go", "B.Gd", "C.Au", "D.Ag"],
        "correct_answer": "C"
    },

    {
        "question": "Who wrote the national anthem of India?",
        "options": ["A.Mahatma Gandhi", "B.Rabindranath Tagore", "C.Subhash Chandra Bose", "D.Jawaharlal Nehru"],
        "correct_answer": "B"
    },

    {
        "question": "Which is the largest ocean in the world?",
        "options": ["A.Indian Ocean", "B.Atlantic Ocean", "C.Arctic Ocean", "D.Pacific Ocean"],
        "correct_answer": "D"
    },

    {
        "question": "What is 15 × 4?",
        "options": ["A.45", "B.50", "C.55", "D.60"],
        "correct_answer": "D"
    },


    {
        "question": "Which country invented paper?",
        "options": ["A.India", "B.Egypt", "C.China", "D.Greece"],
        "correct_answer": "C"
    },

    {
        "question": "Which gas do plants absorb from the atmosphere?",
        "options": ["A.Oxygen", "B.Carbon Dioxide", "C.Nitrogen", "D.Hydrogen"],
        "correct_answer": "B"
    },

    {
        "question": "Who is known as the Father of the Nation in India?",
        "options": ["A.Bhagat Singh", "B.Sardar Patel", "C.Mahatma Gandhi", "D.Dr. B.R. Ambedkar"],
        "correct_answer": "C"
    },

    {
        "question": "Which is the smallest prime number?",
        "options": ["A.0", "B.1", "C.2", "D.3"],
        "correct_answer": "C"
    },

    {
        "question": "How many continents are there in the world?",
        "options": ["A.5", "B.6", "C.7", "D.8"],
        "correct_answer": "C"
    },
]
score = 0
print("QUIZ")
for q in questions :
    print(q["question"])
    for op in q["options"]:
        print(op)
    user_ans = input("enter the ans :")
    if user_ans ==q["correct_answer"]:
        print("correct ans")
        score+=1
    else:
        print("wrong ans")

       
print(f"final score {score} out of {len(questions)}")
