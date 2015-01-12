var logger = new Logger();

$(function(){
  logger.bind($("#log"));
  logger.log("sample app started!");
  
  
  $("#testAjax").click(function(){
    $.ajax({url:"./"})
      .then(function(){
        logger.log("success ajax");
        logger.log(JSON.stringify(arguments));
      },function(){
        logger.log("failed ajax");
      })

  });
  
  
  
});