#language: es
@testfeature
Característica: Product - Store

@test
  Escenario: Validación del precio de un producto
    Dado estoy en la página de la tienda
    Y me logueo con mi email "karen.quispe.arana@gmail.com" y password "qwerty@123456K"
    Cuando navego a la categoria Clothes y subcategoria Men
    Y agrego "2" unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito
