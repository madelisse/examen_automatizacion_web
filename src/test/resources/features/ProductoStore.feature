#language: es
@testfeature
Característica: Product - Store

@test
  Esquema del escenario: Validación del precio de un producto
    Dado estoy en la página de la tienda
    Y me logueo con mi email "<email>" y password "<password>"
    Cuando navego a la categoria Clothes y subcategoria Men
    Y agrego "2" unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito
    Y vuelvo a validar el calculo de precios en el carrito
  Ejemplos:
    | email                        | password         |
    | karen.quispe.arana@gmail.com |qwerty@123456K    |
    | usuario.incorrecto@gmail.com |passwordincorrecto|