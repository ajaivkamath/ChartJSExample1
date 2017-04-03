<!doctype html>
<html>

<head>
    <title>Pie Chart</title>
    <script src="js/Chart.bundle.js"></script>
    <script src="js/jquery.min.js"></script>
    <script src="js/utils.js"></script>
</head>

<body>
    <div id="canvas-holder" style="width:40%">
        <canvas id="chart-area" />
    </div>
    <button id="randomizeData">Randomize Data</button>
    <button id="addDataset">Add Dataset</button>
    <button id="removeDataset">Remove Dataset</button>
    
    <script>
    var randomScalingFactor = function() {
        return Math.round(Math.random() * 100);
    };

    window.onload = function() {
        var ctx = document.getElementById("chart-area").getContext("2d");
        
        $.ajax({
        	  url: "chartData.action",
        	  method: "GET",
        	  success: function(result){
        		  //result = decodeURI(result);


       			  var str = HtmlEncode(result);
       			  var json = JSON.parse(str);
        		  console.log(json);

        		  var labelRec = json.label; 
        		  var dataRec = json.data;

        		  console.log(labelRec);
        		  console.log(dataRec);

        		  
        		    var config = {
        		            type: 'pie',
        		            data: {
        		                datasets: [{
        		                    data: dataRec,
        		                    backgroundColor: [
        		                        window.chartColors.red,
        		                        window.chartColors.orange,
        		                        window.chartColors.yellow,
        		                        window.chartColors.green,
        		                        window.chartColors.blue,
        		                    ],
        		                    label: 'Dataset 1'
        		                }],
        		                labels: labelRec
        		            },
        		            options: {
        		                responsive: true
        		            }
        		        };
        		  
        		  
        		  window.myPie = new Chart(ctx, config);
        		          	      
        	  }
        	  
        	  
        	});        
        
        alert("result3");
        
    };

    
    function HtmlEncode(s)
    {
      var el = document.createElement("div");
      return $('<div/>').html(s).text();;
    }    
    
    document.getElementById('randomizeData').addEventListener('click', function() {
        config.data.datasets.forEach(function(dataset) {
            dataset.data = dataset.data.map(function() {
                return randomScalingFactor();
            });
        });

        window.myPie.update();
    });

    var colorNames = Object.keys(window.chartColors);
    document.getElementById('addDataset').addEventListener('click', function() {
        var newDataset = {
            backgroundColor: [],
            data: [],
            label: 'New dataset ' + config.data.datasets.length,
        };

        for (var index = 0; index < config.data.labels.length; ++index) {
            newDataset.data.push(randomScalingFactor());

            var colorName = colorNames[index % colorNames.length];;
            var newColor = window.chartColors[colorName];
            newDataset.backgroundColor.push(newColor);
        }

        config.data.datasets.push(newDataset);
        window.myPie.update();
    });

    document.getElementById('removeDataset').addEventListener('click', function() {
        config.data.datasets.splice(0, 1);
        window.myPie.update();
    });
    </script>
</body>
</html>
