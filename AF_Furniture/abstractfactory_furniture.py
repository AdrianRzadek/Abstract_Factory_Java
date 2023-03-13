from abc import ABC, abstractmethod


class Furniture(ABC):
    @abstractmethod
    def paint(self):
        pass


class ArtDecoFurniture(Furniture):
    def paint(self):
        return "Render a Furniture in a ArtDeco style"


class ModernFurniture(Furniture):
    def paint(self):
        return "Render a Furniture in a Modern style"


class VictorianFurniture(Furniture):
    def paint(self):
        return "Render a Furniture in a Victorian style"


class FurnitureFactory(ABC):
    @abstractmethod
    def create_Meble(self):
        pass


class ArtDecoFurnitureFactory(FurnitureFactory):
    def create_Meble(self):
        return ArtDecoFurniture()


class ModernFurnitureFactory(FurnitureFactory):
    def create_Meble(self):
        return ModernFurniture()


class VictorianFurnitureFactory(FurnitureFactory):
    def create_Meble(self):
        return VictorianFurniture()

print("choose one")
print("write:artdeco,modern,victorian")
furniture = input()

if furniture == "artdeco":
    factory = ArtDecoFurnitureFactory()
elif furniture == "modern":
    factory = ModernFurnitureFactory()
elif furniture == "victorian":
    factory = VictorianFurnitureFactory()
else:
    raise NotImplementedError(f"Not implemented for your platform: {furniture}")

furniture = factory.create_Meble()
result = furniture.paint()
print(result)