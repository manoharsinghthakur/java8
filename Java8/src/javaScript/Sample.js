var BigDecimal=Java.type('java.math.BigDecimal');

function calculate(amount, percentage){
	
	var result=new BigDecimal(amount).multiply(new BigDecimal(percentage)).devide(new BigDecimal("100"),2, BigDecimal.ROUND_HALF_EVEN);
	
	return result.toPlainString();

}

var result=calculate(10000000000045,13.2);
print(result); 