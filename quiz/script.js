const quizForm = document.querySelector('#quiz-form');
const quizResults = document.querySelector('#quiz-results');

quizForm.addEventListener('submit', (event) => {
    event.preventDefault();

    const answers = ['a', 'a', 'c', 'c', 'a']; // Correct answers
    let score = 0;

    for (let i = 1; i <= 5; i++) {
        const selected = document.querySelector(`input[name=q${i}]:checked`);
        if (!selected) {
            alert(`You missed question ${i}.`);
            return;
        }

        if (selected.value === answers[i - 1]) {
            score++;
            selected.parentNode.classList.add('correct');
        } else {
            selected.parentNode.classList.add('incorrect');
        }
    }

    quizResults.innerHTML = `You got ${score} out of 5 correct.`;
});

function resetQuiz() {
    quizForm.reset();
    quizResults.innerHTML = '';
    const labels = document.querySelectorAll('label');
    labels.forEach((label) => {
        label.classList.remove('correct', 'incorrect');
    });
}