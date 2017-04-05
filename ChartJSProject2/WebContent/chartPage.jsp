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

        //		  var labelRec = json.data.labels; 
        	//	  var dataRec = json.data.datasets[0].data;

        		//  console.log(labelRec);
        		 // console.log(dataRec);

					var config2 = json;        		  
        		  //console.log(config2);
        		    
        		  //window.myPie = new Chart(ctx, config);
        		  window.myPie = new Chart(ctx, config2);
        		  //alert(1);  	      
        	  }
        	  
        	  
        	});        
        
       // alert("result3");
        
    };

    
    function HtmlEncode(s)
    {
      var el = document.createElement("div");
      return $('<div/>').html(s).text();;
    }    
    
    var colorNames = Object.keys(window.chartColors);

    </script>
</body>
</html>
<!-- 

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
        		  
        		  
        		  console.log(config);

 -->