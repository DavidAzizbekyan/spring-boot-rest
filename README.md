### spring-boot-rest
Basic Rest application with CRUD functionality.

### Entity
Item
- id
- name
- amount

### Endpoints
- $SERVER/items/add                     Add one item.
- $SERVER/items/addMany                 Add array of items.

- $SERVER/items/getAll                  Get all items.
- $SERVER/items/getById/$id             Get item with $id.
- $SERVER/items/getByName/$name         Get item with $name.

- $SERVER/items/updateById/$id          Update item by $id.

- $SERVER/items/deleteById/$id          Delete item by $id.

- $SERVER/items/getAmountByName/$name   Get item amount by $name.
- $SERVER/items/getAllByAmount/$amount  Get all items by $amount.
