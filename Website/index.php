<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "predictivemaintainance";

$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$result=mysqli_query($conn,"SELECT * FROM status");
$count = $result->num_rows;

$i = 0;
while($res = mysqli_fetch_assoc($result)) {
    switch($res['no']) {
        case 1:
            $eng1 = $res['stat'];
            break;
        case 2:
            $eng2 = $res['stat'];
            break;
        case 3:
            $eng3 = $res['stat'];
            break;
        case 4:
            $eng4 = $res['stat'];
    }    
}
    
?>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>pred</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/styles.css">
    <script src = "https://code.jquery.com/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="radialIndicator.js"></script>
</head>

<body>
    <h1 class="text-nowrap text-center show" id="head"><strong>Predicitve Maintanance</strong></h1>
    <hr class="line">
    <div class="row">
        <div class="col-md-3 meter">
            <div><h1 class="engine_type">Engine 1</h1></div>
            <div id="indicatorContainer">
            	<script type="text/javascript">$('#indicatorContainer').radialIndicator({
            		radius:80,
		        	barColor: '#87CEEB',
		        	barWidth: 20,
                    maxValue: 191,
                    initValue: 111,
		        	roundCorner : true,
		        	percentage: false,
		    		});
	    		</script>
            </div>
            <div class="alert">
                <?php
                    if ($eng1 == 0) {
                        echo "Maintenance not required";
                    } elseif ($eng1 == 1) {
                        echo "Maintenance required in 30 hours";
                    }  else {
                        echo "Maintenance required in 15 hours";
                    }
                ?>  
            </div>
        </div>
        <div class="col-md-3 meter">
            <div><h1 class="engine_type">Engine 2</h1></div>
            <div id="indicatorContainer2">
            	<script type="text/javascript">$('#indicatorContainer2').radialIndicator({
		        	radius:80,
		        	barColor: '#87CEEB',
		        	barWidth: 20,
		        	initValue: 96,
		        	roundCorner : true,
		        	percentage: false,
		    		});
	    		</script>
            </div>
            <div class="alert"><?php
                    if ($eng2 == 0) {
                        echo "Maintenance not required";
                    } elseif ($eng2 == 1) {
                        echo "Maintenance required in 30 hours";
                    }  else {
                        echo "Maintenance required in 15 hours";
                    }
                ?>
            </div>
        </div>
        <div class="col-md-3 meter">
            <div><h1 class="engine_type">Engine 3</h1></div>
            <div id="indicatorContainer3">
            	<script type="text/javascript">$('#indicatorContainer3').radialIndicator({
		        	radius:80,
		        	barColor: '#87CEEB',
		        	barWidth: 20,
		        	initValue: 67,
		        	roundCorner : true,
		        	percentage: false,
		    		});
	    		</script>
            </div>
            <div class="alert">
            <?php
                if ($eng3 == 0) {
                    echo "Maintenance not required";
                } elseif ($eng3 == 1) {
                    echo "Maintenance required in 30 hours";
                }  else {
                    echo "Maintenance required in 15 hours";
                }
            ?>        
            </div>
        </div>
        <div class="col-md-3 meter">
            <div><h1 class="engine_type">Engine 4</h1></div>
            <div id="indicatorContainer4">
            <script type="text/javascript">$('#indicatorContainer4').radialIndicator({
		        	radius:80,
		        	barColor: '#87CEEB',
		        	barWidth: 20,
		        	initValue: 30,
		        	roundCorner : true,
		        	percentage: false,
		    		});
	    		</script>
            </div>
            <div class="alert">
                <?php
                    if ($eng4 == 0) {
                        echo "Maintenance not required";
                    } elseif ($eng4 == 1) {
                        echo "Maintenance required in 30 hours";
                    }  else {
                        echo "Maintenance required in 15 hours";
                    }
                ?>
            </div>
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>