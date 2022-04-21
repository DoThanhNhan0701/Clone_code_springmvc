
function addToCart(productId){
    let url = "/CNPM-LNT-spring/api/cart/"+productId;
    fetch(url).then(res=>res.json()).then(data=>{
        var count = document.getElementById("cart-count");
        count.innerText= data;
    });
}

function deleteCart(productId){
    var tmp = confirm("bạn có chắc chắn muốn xóa sản phẩm này ra khỏi giỏ hàng không? ");
    if(tmp){
        let url = "/CNPM-LNT-spring/api/cart/delete/"+productId;
        fetch(url).then(res=>res.json()).then(data=>{
            var area = document.getElementById(`giohang--${productId}`);
            area.style.display= "none";
            var count = document.getElementById("cart-count");
            count.innerText= data;
        })
    }
}

function them(productId){
    let url = "/CNPM-LNT-spring/api/cart/add/"+productId;
    console.log(url);
    fetch(url).then(res=>res.json()).then(data=>{
        var area = document.getElementById(`count-cart-${productId}`);
        area.value= parseInt(area.value)+1;
        var count = document.getElementById("cart-count");
        count.innerText= data;
    })
}

function bot(productId){
    let area = document.getElementById(`count-cart-${productId}`);
    if(parseInt(area.value)>1){
        let url = "/CNPM-LNT-spring/api/cart/tru/"+productId;
        console.log(url);
        fetch(url).then(res=>res.json()).then(data=>{
            var area = document.getElementById(`count-cart-${productId}`);
            area.value= parseInt(area.value)-1;
            var count = document.getElementById("cart-count");
            count.innerText= data;
        })
    }
}