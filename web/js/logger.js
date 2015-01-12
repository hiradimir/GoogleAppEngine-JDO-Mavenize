var Logger = function(){
  var logs = [];
  var $element;
  var update = function(){
    if($element){
      var _logs = logs;
      logs = [];
      $.each(_logs, function(i, log){
        $("<div>").text(log).prependTo($element);
      });
    }
  };
  this.log = function(msg){
    logs.push(msg);
    update()
  };
  this.bind = function(element){
    $element = $($(element).get(0));
  };
  return this;
};

