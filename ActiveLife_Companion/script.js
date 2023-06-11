window.addEventListener('load', function() {
    // DOM elements
    const startButton = document.getElementById('startButton');
    const stopButton = document.getElementById('stopButton');
    const stepCountElement = document.getElementById('stepCount');
    const distanceElement = document.getElementById('distance');
    const caloriesElement = document.getElementById('calories');
    const recommendationElement = document.getElementById('recommendation');

    // Variables
    let stepCount = 0;
    let distance = 0;
    let calories = 0;
    let isTracking = false;

    // Exercise recommendations
    const recommendations = [
        'Take a 10-minute walk around the neighborhood.',
        'Try some gentle stretching exercises at home.',
        'Join a local senior yoga class for relaxation and flexibility.',
        'Consider swimming for a low-impact full-body workout.',
        'Engage in gardening to stay active and enjoy nature.',
        'Dance to your favorite music for a fun and energizing workout.'
    ];

    // Start button click event
    startButton.addEventListener('click', function() {
        isTracking = true;
        startTracking();
    });

    // Stop button click event
    stopButton.addEventListener('click', function() {
        isTracking = false;
    });

    // Function to simulate tracking
    function startTracking() {
        if (isTracking) {
            stepCount++;
            distance += 0.5; // Assuming 0.5 meters per step
            calories += 0.05; // Assuming 0.05 calories burned per step

            // Update UI
            stepCountElement.textContent = 'Steps: ' + stepCount;
            distanceElement.textContent = 'Distance: ' + distance.toFixed(2) + ' meters';
            caloriesElement.textContent = 'Calories Burned: ' + calories.toFixed(2);

            // Generate random exercise recommendation
            const randomIndex = Math.floor(Math.random() * recommendations.length);
            const randomRecommendation = recommendations[randomIndex];

            // Update recommendation element
            recommendationElement.textContent = 'Recommendation: ' + randomRecommendation;

            // Recursive call for continuous tracking
            setTimeout(startTracking, 500000); // Update every second
        }
    }
});
