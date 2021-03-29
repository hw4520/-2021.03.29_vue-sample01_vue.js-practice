<template>
  <div>
    <h1>Vuex 02</h1>

    <p>item count: {{ count }}</p>
    <p>item test: {{ testNum }}</p>
    <p>
      <b-form-group id="input-group-1" label="Your Name:" label-for="input-1">
        <b-form-input id="input-1"
                      v-model="form.name"
                      placeholder="Enter Name"
                      required
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-2" label="Favorite Language:" label-for="input-2">
        <b-form-input id="input-2"
                      v-model="form.lang"
                      placeholder="Enter Language"
                      required
        ></b-form-input>
      </b-form-group>
    </p>

    <p>
      <b-btn-group>
        <b-btn variant="info" @click="addItem({name : form.name, lang : form.lang})">Add</b-btn>
        <b-btn variant="primary" @click="clearItem">Clear</b-btn>
        <b-btn variant="primary" @click="test(count)">test</b-btn>
        <b-btn variant="danger" @click="removeItem(form.name)">Remove</b-btn>
      </b-btn-group>
    </p>

    <div v-for="(item, index) in items" :key="index" class="mb-2">
      {{ item.name }} | {{ item.lang }}
    </div>
  </div>
</template>

<script>
import {mapState, mapGetters, mapMutations, mapActions} from 'vuex'
export default {
  name: 'vuex02',
  data () {
    return {
      form: {},
      testNum : 0
    }
  },
  computed: {
    ...mapGetters({
      count : 'itemsCount'
    }),
/*
    count () {
      return this.$store.getters.itemsCount
    },
*/
    ...mapState(['items'])
/*
    items () {
      return this.$store.state.items
    }
*/
  },
  methods: {
    ...mapActions(['addItem']),
/*
    addItem () {
      this.$store.dispatch('addItem', {
        name: this.form.name,
        lang: this.form.lang
      })
    },
*/
    clearItem () {
      this.form = {}
    },
    test(count) {
      this.testNum = count;
    },
    ...mapMutations(['removeItem'])
/*
    removeItem () {
      this.$store.commit('removeItem', this.form.name)
    }
*/
  }
}
</script>