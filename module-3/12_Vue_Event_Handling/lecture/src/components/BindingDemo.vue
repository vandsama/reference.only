<template>
    <section>
        <div>
            <label for="red">Red</label>
            <input 
                type="radio" 
                name="color" 
                id="red" 
                value="Red"
                v-model="selectedColor"
                />
            <label for="green">Green</label>
            <input 
                type="radio" 
                name="color" 
                id="red" 
                value="Green"
                v-model="selectedColor"
            />
            <p>{{ selectedColor }}</p>
        </div>
        <div>
            <label for="chips">Chips</label>
            <input 
                type="checkbox" 
                name="side" 
                id="chips" 
                value="Chips" 
                v-model="selectSide">
            <label for="soup">Soup</label>
            <input 
                type="checkbox" 
                name="side" 
                id="soup" 
                value="Soup" 
                v-model="selectSide">
            <p v-for="side in selectedSides" v-bind:key="side">{{side}}</p>
        </div>
        <div>
            <input type="text" v-model.number="myValue" />
            <p>{{ myValue }}</p>
        </div>
    </section>
</template>


<script>
export default {
    name: "BindingDemo",
    data() {
        return {
            selectedColor: "",
            selectedSides: [],
            myValue: "",
        };
    },

}
</script>

<style scoped>

</style>
