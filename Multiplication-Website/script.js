let num1, num2;

function generateQuestion() {
    num1 = Math.floor(Math.random() * 12) + 1;
    num2 = Math.floor(Math.random() * 12) + 1;
    document.getElementById('question').textContent = `What is ${num1} × ${num2}?`;
    document.getElementById('answer').value = '';
    document.getElementById('result').textContent = '';
}

function checkAnswer() {
    const userAnswer = parseInt(document.getElementById('answer').value, 10);
    if (userAnswer === num1 * num2) {
        document.getElementById('result').textContent = 'Correct! 🎉';
        document.getElementById('result').style.color = 'green';
    } else {
        document.getElementById('result').textContent = `Incorrect. The answer is ${num1 * num2}.`;
        document.getElementById('result').style.color = 'red';
    }
}

generateQuestion();
