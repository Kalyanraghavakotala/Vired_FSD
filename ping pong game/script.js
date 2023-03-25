const paddleLeft = document.getElementById('paddle-left');
const paddleRight = document.getElementById('paddle-right');
const ball = document.getElementById('ball');
const scoreLeft = document.getElementById('score-left');
const scoreRight = document.getElementById('score-right');

let ballX = 290; // Initial ball position
let ballY = 190;
let ballSpeedX = 5; // Initial ball speed
let ballSpeedY = 5;
let paddleLeftY = 150; // Initial paddle positions
let paddleRightY = 150;
let scoreLeftValue = 0; // Initial scores
let scoreRightValue = 0;

function update() {
    // Update ball position
    ballX += ballSpeedX;
    ballY += ballSpeedY;

    // Check for collision with top and bottom walls
    if (ballY <= 0 || ballY >= 385) {
        ballSpeedY = -ballSpeedY;
    }

    // Check for collision with left paddle
    if (ballX <= 30 && ballY >= paddleLeftY && ballY <= paddleLeftY + 70) {
        ballSpeedX = -ballSpeedX;
    }

    // Check for collision with right paddle
    if (ballX >= 560 && ballY >= paddleRightY && ballY <= paddleRightY + 70) {
        ballSpeedX = -ballSpeedX;
    }

    // Check for score
    if (ballX <= 0) {
        scoreRightValue++;
        scoreRight.innerHTML = scoreRightValue;
        ballX = 290;
        ballY = 190;
        ballSpeedX = -ballSpeedX;
    }

    if (ballX >= 585) {
        scoreLeftValue++;
        scoreLeft.innerHTML = scoreLeftValue;
        ballX = 290;
        ballY = 190;
        ballSpeedX = -ballSpeedX;
    }

    // Update ball and paddle positions
    ball.style.left = ballX + 'px';
    ball.style.top = ballY + 'px';
    paddleLeft.style.top = paddleLeftY + 'px';
    paddleRight.style.top = paddleRightY + 'px';
}

function onKeyDown(event) {
    // Move left paddle up
    if (event.keyCode === 87) {
        paddleLeftY -= 10;
    }

    // Move left paddle down
    if (event.keyCode === 83) {
        paddleLeftY += 10;
    }

    // Move right paddle up
    if (event.keyCode === 38) {
        paddleRightY -= 10;
    }

    // Move right paddle down
    if (event.keyCode === 40) {
        paddleRightY += 10;
    }
}

setInterval(update, 20); // Update game every 20 milliseconds

document.addEventListener('keydown', onKeyDown); // Listen for key presses

