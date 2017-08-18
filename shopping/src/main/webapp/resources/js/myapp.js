
$(function() {
	
	switch(menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;
		
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
	     $('#listProducts').addClass('active');
	     break;

	default:
		if(menu == "Home") break;
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}



//Code for jquery datatable

var products = [
	
	['1','ABC'],
	['2','ABD'],
	['3','ABE'],
	['4','ABF'],
	['5','ABG'],
	['6','ABH']

	];
 var $table = $('#productListTable');
	
	if($table.length){
		
		//console.log('Inside the table');
		
		$table.DataTable({
			lengthMenu: [[3,5,10,-1] ['3 Records', '5 Records', '10 Records','ALL'] ],
			pageLength: 5,
			data : products
		});
		
		
	}


});