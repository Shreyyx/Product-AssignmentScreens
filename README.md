<h1>Moqui Training</h1>


<h4>This file gives us an overview of how each API works and performs the related CRUD operations. Below are the screenshots attached for the same.</h4>


Screenshots after testing the given APIs:

1. Create a Party: POST /parties
   
![image](https://github.com/user-attachments/assets/d030e3d3-7ea3-4750-9b47-558e5edd7254)


2.Retrieve Party Details: GET /parties/{party_id}

Get all party details

![image](https://github.com/user-attachments/assets/25a809c9-c786-4e10-8382-ce9cb38ceb1f)

Get a single party

![image](https://github.com/user-attachments/assets/5ba9dfb5-6f59-4f8e-b8b6-88fe9563f630)


When no such party exists

![image](https://github.com/user-attachments/assets/ead61df9-2a7b-4fdc-b448-5f8542983b5f)


3.Update a Party: PUT /parties/{party_id}

![image](https://github.com/user-attachments/assets/ebb2b38b-d579-466c-ad34-6f73ed6a520d)


4.Delete a Party: DELETE /parties/{party_id}

![image](https://github.com/user-attachments/assets/e26573b8-b7dd-4b2a-a790-22a81d1aac30)

Deleting a party when an order exists

![image](https://github.com/user-attachments/assets/f7de8034-acd3-43bb-bba9-94f79be48d39)

Deleting a party when it does not exists

![image](https://github.com/user-attachments/assets/0482c712-993e-4e34-b3d0-6ecfb614e547)


5.Add Contact Mechanism: POST /parties/{party_id}/contacts

![WhatsApp Image 2024-12-27 at 3 37 59 PM](https://github.com/user-attachments/assets/b87d3e79-d892-4a0c-b959-01eb5a7f80c2)


6.Retrieve Contact Mechanisms: GET /parties/{party_id}/contacts

![image](https://github.com/user-attachments/assets/de98f0ac-50b1-4cf2-9267-44555caf5176)


7.Update Contact Mechanism: PUT /parties/{party_id}/contacts/{contact_mech_id}

![image](https://github.com/user-attachments/assets/8addbe5f-9528-4a6a-87da-03c226e87bb1)

When for the given party contactmech is not created 

![image](https://github.com/user-attachments/assets/1ea65c2a-ec7c-4467-b4d6-bab6f03dec68)


8.Delete Contact Mechanism: DELETE /parties/{party_id}/contacts/{contact_mech_id}

![WhatsApp Image 2024-12-27 at 3 43 16 PM](https://github.com/user-attachments/assets/5a931ad8-d54f-430c-9a41-ee548ec1fa51)


9.Create a Product: POST /products

![image](https://github.com/user-attachments/assets/cdcd6f18-e80e-4866-8eb3-426e68d6d69f)


10.Retrieve all Product Details: GET /products/{product_id}

![image](https://github.com/user-attachments/assets/5c70e05e-5909-4874-878c-cb888da9cadd)


11.Get a product:

![image](https://github.com/user-attachments/assets/c12548e7-f1f4-443d-b47d-b3db399eae47)


When no such Product Exists:

![image](https://github.com/user-attachments/assets/b5b216e5-5789-47e1-aa53-bc6856fe1601)


12.Update a Product: PUT /products/{product_id}

![image](https://github.com/user-attachments/assets/df8c45dc-71df-4ee7-8ee2-208812317b25)


13.Delete a Product: DELETE /products/{product_id}

![WhatsApp Image 2024-12-27 at 3 55 00 PM](https://github.com/user-attachments/assets/6833ec99-f228-49cf-8313-d830212d8e02)


14.Create an Order: POST /orders

![image](https://github.com/user-attachments/assets/da9815b9-b4ad-426f-b7ec-8cece51c1c49)


15.Retrieve Order Details: GET /orders/{order_id}

![image](https://github.com/user-attachments/assets/099da9a0-d0f3-4d22-9e92-5d15102b011d)


16.Update an Order with item: PUT /orders/{order_id}
![image](https://github.com/user-attachments/assets/eb1f1de7-e457-45dc-9d5d-c1d14aec3775)


17.Delete an Order with item: DELETE /orders/{order_id}

![image](https://github.com/user-attachments/assets/96c1b194-969c-4c0c-b0d5-5a8a62d03d50)


18.Add an Order Item: POST /orders/{order_id}/items

![WhatsApp Image 2024-12-27 at 4 57 29 PM](https://github.com/user-attachments/assets/d509aa98-736e-4feb-94c9-7d2d9c90f9cf)

When Quantity is Zero

![image](https://github.com/user-attachments/assets/fdc58327-6b97-4d05-96f2-ac961017340c)


19.Delete an Order Item

![image](https://github.com/user-attachments/assets/b2ffda43-dbd2-444c-a7bc-db6f2c4a41ff)



















"# MoquiAssignment" 
"# MoquiAssignment" 
